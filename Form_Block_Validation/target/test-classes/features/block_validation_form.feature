@Regresion
Feature: Formulario Block Validation
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través de un globo informativo.

  @CasoExitoso
  Scenario Outline: Diligenciamiento exitoso del formulario BlockValidation,
  no se presenta ningún mensaje de validación
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation y Block Validation
    When Diligencio los campos <Required>,<Email>,<Password1>,<Password2>,<Date>,<Url>,<Digits Only>,<Range>
    Then Verifico ingreso exitoso
    Examples:
      | Required	| Email				        | Password1	| Password2	|  Date		    | Url			            | Digits Only	| Range	|
      | "Ejemplo"	| "ejemplo@mail.com"		| "valor1"	| "valor1"	| "01062020"	| "http://www.valor.com"	| "123"		    | "15"	|
      | "Ejemplo2"	| "ejemplo2@mail.com"		| "valor2"	| "valor2"	| "02062020"	| "http://www.valor2.com"	| "333"		    | "8"	|

  @CasoAlterno
  Scenario Outline: Diligenciamiento con errores del formulario BlockValitadion,
  se presenta mensaje de error indicando que falta el diligenciamiento de alguno de los campos

  Given Autentico en colorlib con usuario "demo" y clave "demo"
  And Ingreso a la funcionalidad Forms Validation y Block Validation
  When Diligencio los campos <Required>,<Email>,<Password1>,<Password2>,<Date>,<Url>,<Digits Only>,<Range>
  Then Verifico que se presente un mensaje de error
  Examples:
  | Required	| Email				        | Password1	| Password2	|  Date		    | Url			            | Digits Only	| Range	|
  |    ""     	| "ejemplo@mail.com"		| "valor1"	| "valor1"	| "01062020"	| "http://www.valor.com"	| "123" 	    | "15"	|
  | "Ejempplo3" | "ejemplo@mail.com"		| "valor1"	| "valor1"	| "02062020"   	| "http://www.valor.com"	| "gsd"		    | "6"	|
  | "222jjj"    | "ejemplomail.com"		    | "valor1"	| "valor1"	| "02062020"   	| "http://www.valor.com"	| "456"		    | "7"	|
  | "222jjj"    | "ejemplo4@mail.com"		| "valor1"	| "valor2"	| "02062020"   	| "http://www.valor.com"	| "789"		    | "13"	|
  | "222jjj"    | "ejemplo4@mail.com"		| " "   	| ""	    | "02062020"   	| "http://www.valor.com"	| "654"		    | "16"	|
  | "222jjj"    | "ejemplo4@mail.com"		| "valor1"	| "valor2"	| " "        	| "http://www.valor.com"	| "321"		    | "8"	|
  | "222jjj"    | "ejemplo4@mail.com"		| "valor1"	| "valor2"	| "02062020"   	| "www.valor.com"	        | " "		    | "9"	|
  | "unejemplo33"    | "ejemplo55.ejemplo@mail.com"		| "valor1"	| "valor1"	| "03062020"   	| "http://www.valor.com"	| "985"		    | "3"	|