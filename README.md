# FlexBoxFX
FlexBoxFX is a JavaFX implementation of CSS3 flexbox layout manager (https://css-tricks.com/snippets/css/a-guide-to-flexbox/).

Official Website: http://flexboxfx.io                    
Youtube trailer: https://www.youtube.com/watch?v=nuJ0s5imAdo
Kickstarter: https://www.kickstarter.com/projects/ultramixer/flexboxfx-javafx-port-of-css3-flexbox-layout-manag
                        
<iframe width="480" height="270" src="https://www.kickstarter.com/projects/ultramixer/flexboxfx-javafx-port-of-css3-flexbox-layout-manag/widget/video.html" frameborder="0" scrolling="no"> </iframe>
                        

# Why FlexBoxFX? #
Modern user interface design means Responsive Design to match the needs of all platforms like Desktop, Web and Mobile and different target devices like Laptops, Tablets and Smartphones.

Since CSS3 there is the flexbox layout manager to create complex responsive layouts with less code. Currently there is no such powerful layout manager available in JavaFX – that is the reason why it’s nearly impossible to write modern responsive applications with JavaFX.

Our goal is to write a complete **JavaFX port of CSS3 flexbox layout manager** to hand over the JavaFX developer a modern and powerful layout manager.

**Help us to reach the funding goal** on [kickerstarter](https://www.kickstarter.com/projects/ultramixer/flexboxfx-javafx-port-of-css3-flexbox-layout-manag) and become one of the FlexBoxFX sponsors on flexboxfxio. Depending on donation, your company logo, a description and the link to your homepage will be placed in one of the sponsor sections (diamond, gold, silver, bronze).
                        
When the funding goal is reached we start to implement FlexBoxFX as an open source project on GitHub. So FlexBoxFX will be open source and free to use for commercial use.

# Example #
```xml
<FlexBoxPane fx:id="flexBoxPane" horizontalSpace="20" verticalSpace="20" styleClass="flex-pane" direction="ROW"> 
  <Button text="Item 5" styleClass="item,item1" FlexBox.order="5" FlexBox.grow="1"></Button>
  <Button text="Item 1" styleClass="item,item2" FlexBox.order="1" FlexBox.grow="2"></Button> 
  <Button text="Item 10" styleClass="item,item3" FlexBox.order="10" FlexBox.grow="1"></Button> 
</FlexBoxPane>
```


# Build FlexBoxFX #
```
gradle build
```
You'll find the binary jar file here: <project-dir>/build/libs


# Maven #
```
<!-- https://oss.sonatype.org/content/repositories/snapshots //-->
<dependency>
    <groupId>com.onexip</groupId>
    <artifactId>FlexBoxFX</artifactId>
    <version>0.1.5.3-SNAPSHOT</version>
</dependency>
```

# Gradle #
```
compile('com.onexip:FlexBoxFX:0.1.5.3-SNAPSHOT')
```


# License #
(c) 2016 - 2017 onexip GmbH
FlexBoxFX is open source and released under [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0) –  so it is free to use for non-commercial and commercial use and

# Team #
* Project Lead: Tobias Bley
* Developer: Matthias Hänel

# Tests #

## TestButtons (com.onexip.flexboxfx.test) ##

<img width="576" alt="test-buttons-1" src="https://cloud.githubusercontent.com/assets/2484805/26397621/3448ca04-4077-11e7-883e-7613c89e8306.png">
<img width="407" alt="test-buttons-2" src="https://cloud.githubusercontent.com/assets/2484805/26397620/34480628-4077-11e7-94d0-572b8e817dbf.png">
<img width="276" alt="test-buttons-3" src="https://cloud.githubusercontent.com/assets/2484805/26397619/34480fba-4077-11e7-9c51-296374cb1809.png">


