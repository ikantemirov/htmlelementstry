package io.ikantemirov;

import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.HtmlElement;

public interface PostContent extends HtmlElement {

    @FindBy(".//span[contains(@class, 'post_like_count')]")
    HtmlElement postLikeCount();
}
