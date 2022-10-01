# Backend на Java #
## Spring Web Framework ##

<h4>Шаг 1: Запустите новый проект Spring Boot</h4>
Создаём новый проект Spring используя сайт `start.spring.io` для веб проекты. 
Популярные варианты для работы включают *IntelliJ Idia, Visual Studio Code*, или же *Eclipse.*


<img src="https://i2.paste.pics/140500af7b092dfc72ab2328bc3392e5.png" width="100%" height="90%" alt="Screenshot">

Проекты, созданные `start.spring.io` содержать Spring Web, фреймворк, который делает Spring готовым к работе внутри вашего приложения, но не требует большого количества кода или настройки. 
Spring Boot — это самый быстрый и популярный способ запуска проектов Spring.

<h4>Шаг 2. Добавьте свой код</h4>

Откройте проект в вашей среде IDE и найходим файл `DemoApplication.java` в папке `src/main/java/com/example/demo`. Теперь создаём функция для того чтобы убедиться что наш сервер
работает и добавляем изменение в файле, добавив дополнительный метод и аннотации, показанные в коде ниже. 

```.java
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("")
    public ResponseEntity getUsers() {
        try {
            return ResponseEntity.ok("Server is working");
        } catch(Exception e) {
            return ResponseEntity.badRequest().body("Error ocured");
        }
    }
}
```

<h4>Шаг 3: Запускаем</h4>

<img src="https://i2.paste.pics/IWFVR.png" width="100%" height="80%" alt="Screenshot">

Откройте браузер и в адресной строке вверху введите http://localhost:8080/users. Мы должны получить ответ, подобный этому:

<img src="https://i2.paste.pics/IWFWE.png" width="100%" height="80%" alt="Screenshot">