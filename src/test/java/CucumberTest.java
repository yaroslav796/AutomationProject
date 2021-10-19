import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.pagefactory.Tag;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty"},
        // Укажите здесь корневые пакеты, в которых хранятся шаги
        // Если вы написали свои классы с шагами, не забудьте указать здесь пакеты, в которых они находятся
        glue = {"ru.sbtqa.tag.stepdefs",
                "ru.fromQAtoQA.learning.autotests.stepdefs"
        },
        // Укажите здесь путь до каталога с фичами
        features = {"src/test/resources/features/"},
        // Здесь можно указать тэг теста или нескольких тестов, которые нужно запустить
        tags = {"@Test1"}
)

public class CucumberTest extends Tag {
}
