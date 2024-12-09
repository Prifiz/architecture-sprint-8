# Как проверить

* docker compose up
* Перейти на http://localhost:3000
* Открыть консоль браузера
* Нажать кнопку Login например с парой user1:password123 - это обычный юзер, которому нельзя видеть отчет
* Выполнить Download Report. Убедиться по консоли, что получен код 401
* Зайти в keycloak (http://localhost:8080) под учеткой админа admin:admin, далее в reports-realm -> sessions, удалить текущую сессию (Sign Out)
* Заходим снова на http://localhost:3000
* Логинимся уже как пользователь протеза например prothetic1:prothetic123
* Выполнить Download Report. Убедиться по консоли, что получен код 200, а в response выведено случайное слово из фразы "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"