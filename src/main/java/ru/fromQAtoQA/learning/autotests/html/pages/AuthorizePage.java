package ru.fromQAtoQA.learning.autotests.html.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.WebPage;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.environment.Environment;
import ru.sbtqa.tag.qautils.properties.Props;

@PageEntry(title = "Страница авторизации")
public class AuthorizePage extends WebPage {

    @ElementTitle(value = "Логин")
    @FindBy(xpath = "//*[@data-test-id='login']")
    public WebElement loginField;

    @ElementTitle(value = "Пароль")
    @FindBy(xpath = "//*[@data-test-id='password']")
    public WebElement passwordField;

    @ElementTitle(value = "Я автотест")
    @FindBy(xpath = "//*[@data-test-id='IamAutotest']")
    public WebElement enterBtn;

    @ElementTitle(value = "Авторизоваться")
    @FindBy(xpath = "//*[@data-test-id='signIn']")
    public WebElement passwordSMSField;

    @ActionTitle(value = "Авторизуется")
    public void authorize() {
//        code
    }

    @ActionTitle(value = "переходит на страницу авторизации")
    public void redirectToAuthorizePage() {
        String startUrl = Props.get("url.startUI");
        Environment.getDriverService().getDriver().get(startUrl);
    }

}
