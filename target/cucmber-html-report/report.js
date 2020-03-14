$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/Features/Task.feature");
formatter.feature({
  "name": "Tela de Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login com sucesso",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Entrar na url",
  "keyword": "Given "
});
formatter.step({
  "name": "clicar login",
  "keyword": "And "
});
formatter.step({
  "name": "informar usuario \"\u003cusuario\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "informar a senha \"\u003csenha\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clico login",
  "keyword": "And "
});
formatter.step({
  "name": "clico em acionar task",
  "keyword": "Then "
});
formatter.step({
  "name": "informar titulo da task \"\u003ctitulo_task\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "selecionar data limite",
  "keyword": "And "
});
formatter.step({
  "name": "hora limite",
  "keyword": "And "
});
formatter.step({
  "name": "informar descricao sobre a task \"\u003cdescricao_task\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "clico no botao salvar",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "usuario",
        "senha",
        "titulo_task",
        "descricao_task"
      ]
    },
    {
      "cells": [
        "bill",
        "1234",
        "automação inmetrics",
        "automatizar rotina do site da empresa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login com sucesso",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Entrar na url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepTask.entrar_na_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar login",
  "keyword": "And "
});
formatter.match({
  "location": "StepTask.clicar_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar usuario \"bill\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepTask.informar_usuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepTask.informar_a_senha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico login",
  "keyword": "And "
});
formatter.match({
  "location": "StepTask.clico_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em acionar task",
  "keyword": "Then "
});
formatter.match({
  "location": "StepTask.clico_em_acionar_task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar titulo da task \"automação inmetrics\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepTask.informar_titulo_da_task(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar data limite",
  "keyword": "And "
});
formatter.match({
  "location": "StepTask.selecionar_data_limite()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton class\u003d\"btn-flat picker__today waves-effect\" type\u003d\"button\" data-pick\u003d\"1583636400000\" aria-controls\u003d\"P79110474\" disabled\u003d\"disabled\"\u003e...\u003c/button\u003e is not clickable at point (954, 586). Other element would receive the click: \u003cdiv class\u003d\"modal-footer\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027severino-ThinkCentre-M93p\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.3.0-40-generic\u0027, java.version: \u00271.8.0_242\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: /tmp/.com.google.Chrome.9875BR}, goog:chromeOptions: {debuggerAddress: localhost:34651}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 0acf12768a7d04eeefd6dc3794391e3d\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat PageObjects.TaskPage.data(TaskPage.java:75)\n\tat stepDefinition.StepTask.selecionar_data_limite(StepTask.java:89)\n\tat ✽.selecionar data limite(file:src/Features/Task.feature:11)\n",
  "status": "failed"
});
formatter.step({
  "name": "hora limite",
  "keyword": "And "
});
formatter.match({
  "location": "StepTask.hora_limite()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "informar descricao sobre a task \"automatizar rotina do site da empresa\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepTask.informar_descricao_sobre_a_task(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clico no botao salvar",
  "keyword": "And "
});
formatter.match({
  "location": "StepTask.clico_no_botao_salvar()"
});
formatter.result({
  "status": "skipped"
});
});