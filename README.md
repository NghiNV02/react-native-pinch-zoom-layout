
# react-native-pinch-zoom-layout

## Getting started

`$ npm install react-native-pinch-zoom-layout --save`

Or

`$ yarn add react-native-pinch-zoom-layout`

### Mostly automatic installation

`$ react-native link react-native-pinch-zoom-layout`

### Manual installation


#### iOS

No action required

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import info.moonjava.RNPinchZoomLayoutPackage;` to the imports at the top of the file
  - Add `new RNPinchZoomLayoutPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-pinch-zoom-layout'
  	project(':react-native-pinch-zoom-layout').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-pinch-zoom-layout/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      implementation project(':react-native-pinch-zoom-layout')
  	```

## Dependencies
Install and link [react-native-gesture-handler](https://github.com/kmagiera/react-native-gesture-handler). To install and link it, run:
```
yarn add react-native-gesture-handler
react-native link react-native-gesture-handler
```

## Usage
```javascript
import React,{Component} from 'react';
import PinchZoomLayout from 'react-native-pinch-zoom-layout';
import {
    Image
} from 'react-native';

export default class ImageViewer extends Component {
    pinZoomLayoutRef=React.createRef();
    render() {
       return(<PinchZoomLayout
                          style={{flex:1}}
                          ref={this.pinZoomLayoutRef}
                          onZoom={this.onZoom}
                          onTap={this.onTap}
                      >
                          <Image
                                style={{width:56,height:56}}
                                source={{
                                  uri:'https://facebook.github.io/react-native/img/header_logo.png'
                              }}
                          />
                      </PinchZoomLayout>)
    }
    
    onZoom=event=>{
        const {
            containerWidth,
            containerHeight,
            contentWidth,
            contentHeight,
            zoomScale
        }=event;
    }
    
    onTap=()=>{
        
    }
}
```

### Configurable props
* [enabled](#enabled)
* [panEnabled](#panEnabled)
* [zoomDuration](#zoomDuration)
* [minimumZoomScale](#minimumZoomScale)
* [maximumZoomScale](#maximumZoomScale)

### Event props
* [onZoom](#onZoom)
* [onTap](#onTap)

### Methods
* [zoom](#zoom)


### Configurable props

#### enabled
Indicates whether the layout allows zoom.
* **true (default)** - allow zoom
* **false** -  Disable zoom

#### panEnabled
Indicates whether the layout can pan when the zoomed content is bigger than the container.
* **true (default)** - Allow pan
* **false** - Disable pan

#### zoomDuration
Animation duration of zoom.
* **default** - 400
Platforms: Android

#### minimumZoomScale
The minimum zoom level.
* **default** - 1

#### maximumZoomScale
The maximum zoom level.
* **default** - 3

#### onZoom
Callback function that is called when the view is zoomed. The event params is

```
const { 
  containerWidth,
  containerHeight,
  contentWidth,
  contentHeight,
  zoomScale
} = event;
```

#### onTap
Callback function that is called when the view is taped

#### zoom()
`zoom({zoomScale, animated})`

Zoom the content view to specific value.


Example:
```
this.pinZoomLayoutRef.current.zoom({zoomScale:2.5, animated:true}); // Zoom content view to 2.5 with animation
```