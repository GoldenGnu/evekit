rmdir /s /q %~dp0src
rmdir /s /q %~dp0gradle
java -jar openapi-generator-cli.jar generate -i https://evekit-model.orbital.enterprises/api/swagger.json -g java -c config.json
pause