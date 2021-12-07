Feature: Probar las Busqueda en Dafiti

  Scenario: Buscar Productos en Dafiti
    Given Navego en Dafiti
    When Busco los en Dafiti 'Excel.xlsx'
    Then Obtengo y Valido los Resultados

