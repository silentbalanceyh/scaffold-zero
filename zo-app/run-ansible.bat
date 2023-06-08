@echo OFF
  call run.env.bat
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
          java -jar target/inst-load.jar true
          java -jar target/inst-menu.jar true
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
     if "PROD" == "%DB_ENV%" (
         echo Waiting for development...
     )
    echo Successfully! Your database has been fully initialized. Now you can start the Zero container!!!

