# FlexBoxFX
FlexBoxFX is a JavaFX implementation of CSS3 flexbox layout manager (https://css-tricks.com/snippets/css/a-guide-to-flexbox/).


# Why FlexBoxFX? #
Modern user interface design means Responsive Design to match the needs of all platforms like Desktop, Web and Mobile and different target devices like Laptops, Tablets and Smartphones.

Since CSS3 there is the flexbox layout manager to create complex responsive layouts with less code. Currently there is no such powerful layout manager available in JavaFX – that is the reason why it’s nearly impossible to write modern responsive applications with JavaFX.

Our goal is to write a complete **JavaFX port of CSS3 flexbox layout manager** to hand over the JavaFX developer a modern and powerful layout manager.


# Example #
```xml
<FlexBoxPane fx:id="flexBoxPane" horizontalSpace="20" verticalSpace="20" styleClass="flex-pane" direction="ROW"> 
  <Button text="Item 5" styleClass="item,item1" FlexBox.order="5" FlexBox.grow="1"></Button>
  <Button text="Item 1" styleClass="item,item2" FlexBox.order="1" FlexBox.grow="2"></Button> 
  <Button text="Item 10" styleClass="item,item3" FlexBox.order="10" FlexBox.grow="1"></Button> 
</FlexBoxPane>
```

# Tests #

## TestButtons (com.onexip.flexboxfx.test) ##

<img width="576" alt="test-buttons-1" src="https://cloud.githubusercontent.com/assets/2484805/26397621/3448ca04-4077-11e7-883e-7613c89e8306.png">
<img width="407" alt="test-buttons-2" src="https://cloud.githubusercontent.com/assets/2484805/26397620/34480628-4077-11e7-94d0-572b8e817dbf.png">
<img width="276" alt="test-buttons-3" src="https://cloud.githubusercontent.com/assets/2484805/26397619/34480fba-4077-11e7-9c51-296374cb1809.png">


