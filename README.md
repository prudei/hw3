# hw3
Не получилось реализовать сериализацию объектов Java в формат .csv

Оставил весь закомментированный код, чтобы вы глянули мои попытки, возможно я где то был близок. (Знаю, что оставлять закомментированный код запрещено, но я подумал, что это особый случай)

Еще были такие же проблемы с подгрузкой данных с локали, но я нашел решение, путем указания специального тега и указания прямого пути <scope>system</scope><systemPath></systemPath>
Причем необходимо было его добавить еще и в зависимость, где находится наш сериализатор, так как он тоже перестал его видеть (хотя модуль описан в pom)

Несколько вечеров убил на поиск решения задачи перевода в csv, очень было бы интересно разобраться до конца, что там за schema и как ей правильно пользоваться для составления вайла данного формата. Можно ли это делать автоматичеки?
