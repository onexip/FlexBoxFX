# FlexBoxFX
FlexBoxFX is a JavaFX implementation of CSS3 flexbox layout manager (https://css-tricks.com/snippets/css/a-guide-to-flexbox/).

Official Website: http://flexboxfx.io

Youtube trailer: https://www.youtube.com/watch?v=nuJ0s5imAdo


# Why FlexBoxFX? #
Modern user interface design means Responsive Design to match the needs of all platforms like Desktop, Web and Mobile and different target devices like Laptops, Tablets and Smartphones.

Since CSS3 there is the flexbox layout manager to create complex responsive layouts with less code. Currently there is no such powerful layout manager available in JavaFX – that is the reason why it’s nearly impossible to write modern responsive applications with JavaFX.

Our goal is to write a complete JavaFX port of CSS3 flexbox layout manager to hand over the JavaFX developer a modern and powerful layout manager.

Help us to reach the founding goal on kickerstarter.com and become one of the FlexBoxFX sponsors on flexboxfxio. Depending on donation, your company logo, a description and the link to your homepage will be placed in one of the sponsor sections (diamond, gold, silver, bronze).

When the founding goal is reached we start to implement FlexBoxFX as an open source project on GitHub. So FlexBoxFX will be open source and free to use for commercial use.

# Example #
```xml
<FlexBox fx:id="flexBoxPane" horizontalSpace="20" verticalSpace="20" styleClass="flex-pane" direction="ROW"> 
  <Button text="Item 5" styleClass="item,item1" FlexBox.order="5" FlexBox.grow="1"></Button>
  <Button text="Item 1" styleClass="item,item2" FlexBox.order="1" FlexBox.grow="2"></Button> 
  <Button text="Item 10" styleClass="item,item3" FlexBox.order="10" FlexBox.grow="1"></Button> 
</FlexBox>
```
