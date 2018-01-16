package io.ikantemirov;

import io.qameta.htmlelements.WebPageFactory;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.not;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public class VkMenuTest {

    @Rule
    public RuleChrome ruleChrome = new RuleChrome();

    private WebPageFactory factory = new WebPageFactory();
    private UserPage page;
    private MenuOpener menuOpener;

    @Test
    public void shouldOpenMenu() {
        menuOpener = new MenuOpener(ruleChrome.getDriver());
        page = menuOpener.getPage();
        page.popupBox().should(displayed());
    }

    @Test
    public void shouldCloseMenu() {
        menuOpener = new MenuOpener(ruleChrome.getDriver());
        page = menuOpener.getPage();
        page.popupBox().xButton().waitUntil(displayed()).click();
        page.popupBox().should(not(displayed()));
    }
}
