# TestUI
### Оглавление  
[Таблица покрытия](#таблица_покрытия)  
[Описание задачи](#описание_задачи)  
[Структура проекта](#структура_проекта)  
[Как запустить тесты](#запуск)  
### Таблица покрытия <a name="таблица_покрытия"></a> 
| Кейс № |Название теста          | Выполнен да/нет|
| ------------- |:------------------:| -----:|
|Кейс 1|**Разница двух целых чисел - differenceTwoIntegers** |да|
|Кейс 2|**Конкатенация двух строк - concatenationTwoStrings**|да|
|Кейс 3|**Появление сообщения при вводе строки в поле - messageAppearance**|да|
## Описание задачи <a name="описание_задачи"></a> 
#### Кейс 1 Разница двух целых чисел
1. Открыть сайт https://testsheepnz.github.io/BasicCalculator.html 
2. Проскроллить вниз до конца
3. Выбрать сборку (Build) «Prototype»
4. Ввести в поле First number значение «2»
5. Ввести в поле Second number значение «3»
6. Выбрать операцию (Operation) «Subtract»
7. Нажать на кнопку «Calculate»
8. Проверить, что в поле ответа (Answer) значение равно «-1»
#### Кейс 2 Конкатенация двух строк.
1. Открыть сайт https://testsheepnz.github.io/BasicCalculator.html 
2. Проскроллить вниз до конца
3. Выбрать сборку (Build) «Prototype»
4. Ввести в поле First number значение «gs»
5. Ввести в поле Second number значение «bu»
6. Выбрать операцию (Operation) «Concatenate»
7. Нажать на кнопку «Calculate»
8. Проверить, что в поле ответа (Answer) значение равно «gsbu»
#### Кейс 3 Появление сообщения при вводе строки в поле
1. Открыть сайт https://testsheepnz.github.io/random-number.html 
2. Проскроллить вниз до конца
3. Выбрать сборку (Select Build) «Demo»
4. Нажать на кнопку «Roll the dice»
5. Ввести в поле значение «string»
6. Нажать на кнопку «Submit»
7. Проверить, что появилось сообщение «string: Not a number!»  
### Структура проекта <a name="структура_проекта"></a>   
**Проект состоит из трёх java классов**:  
***AllTest*** - содержит в себе сами тесты, которые ссылаютсся на классы PageCalculator и PageNumberGame  
***PageCalculator*** - указан адрес страницы с калькулятором, поиск и действия с элементами  
***PageNumberGame*** - указан адрес страницы с кубиками, поиск и действия с элементами  
### Как запустить тесты <a name="запуск"></a>  
1. Открыть проект в IntelliJ IDEA (либо другой среде разработки)
2. Ввести в консоли `mvn clean test`
