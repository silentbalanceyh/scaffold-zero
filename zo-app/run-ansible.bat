@echo OFF
  call run-env.bat
   echo %DB_TYPE%
     if "%DB_TYPE%"=="" (
        echo "The environment variable is missing, please set: DB_ TYPE ( TIDB | MYSQL )"
        exit 1
    )
     echo "Database type:%DB_TYPE%
      SET PATH_SOURCE=%~dp0app@runtime\@source
      if "MYSQL" == "%DB_TYPE%" (
          SET PATH_RUN=%~dp0app@runtime\ansible-mysql
          cd %~dp0app@runtime\ansible-mysql
          call start.bat
    )
      if "TIDB"=="%DB_TYPE%" (
            SET PATH_RUN=%~dp0app@runtime\ansible-tidb
            cd %~dp0app@runtime\ansible-tidb
            call start.sh
    )
      if  "DEV" == "%DB_ENV%" (
          cd %~dp0
          call run-init.bat
          copy %~dp0app@jar\*.jar .\target\
          java -jar target/inst-load.jar
    )
     if "%DB_ATOM%" =="" (
     echo 06. Dynamic modeling is not enabled! end.
    ) else (
        md %~dp0app@runtime\@atom\%DB_ATOM%\meta
        md %~dp0app@runtime\@atom\%DB_ATOM%\model
        md %~dp0app@runtime\@atom\%DB_ATOM%\schema
        copy src\main\resources\atom\%DB_ATOM%/meta/* %~dp0app@runtime\@atom\%DB_ATOM%\meta
        java -jar target/inst-atom.jar cmdb %~dp0
        echo 06. Dynamic modeling/End
    )
        java -jar target/inst-menu.jar
     if "PROD" == "%DB_ENV%" (
         mysql -u"%DB_USER%" -P"%DB_PORT%" -p"%DB_PASSWORD%" -h "%DB_HOST%" --get-server-public-key DB_HOTEL <  "%COMMON_PATH%"\app@runtime\@backup\DB_HOTEL.sql
         mysql -u"%DB_USER%" -P"%DB_PORT%" -p"%DB_PASSWORD%" -h "%DB_HOST%" --get-server-public-key DB_HOTEL_WF <  "%COMMON_PATH%"\app@runtime\@backup\DB_HOTEL_WF.sql
         echo "Database import completed"
     )
    echo Successfully! Your database has been fully initialized. Now you can start the Zero container!!!

