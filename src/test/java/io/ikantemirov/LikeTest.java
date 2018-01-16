package io.ikantemirov;

import io.qameta.htmlelements.*;
import org.junit.Rule;
import org.junit.Test;

import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

public class LikeTest {

    @Rule
    public RuleChrome ruleChrome = new RuleChrome();

    private WebPageFactory factory = new WebPageFactory();
    private UserPage page;
    private LikeClicker likeClicker;

    @Test
    public void shouldCountLike() {
        likeClicker = new LikeClicker(ruleChrome.getDriver());
        page = factory.get(ruleChrome.getDriver(), UserPage.class);
        page.postContent().postLikeCount().should(text(Integer.toString(likeClicker.getLikeCounter() + 1)));
    }

    @Test
    public void shouldCountUnLike() {
        likeClicker = new LikeClicker(ruleChrome.getDriver());
        page = factory.get(ruleChrome.getDriver(), UserPage.class);
        page.postContent().postLikeCount().should(text(Integer.toString(likeClicker.getLikeCounter() -1)));
    }
}
