mvnd clean package install -DskipTests=true -Dmaven.javadoc.skip=true -Dmaven.source.skip=true -Dmaven.compile.fork=true -T 1C
copy zo-inst\zo-dpma\target\inst-load.jar zo-app\app@jar\
copy zo-inst\zo-dpma\target\inst-menu.jar zo-app\app@jar\