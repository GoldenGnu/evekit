rmdir /s /q %~dp0\src
rmdir /s /q %~dp0\gradle
java -jar swagger-codegen-cli.jar generate -i https://evekit-model.orbital.enterprises/api/swagger.json -l java -c config.json
pause