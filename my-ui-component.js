'use strict';

/**
 * Dependencies
 */

var ReactNative = require('react-native');
var React = require('react');

var {
  requireNativeComponent,
  WebView,
  View,
  StyleSheet
} = ReactNative;

var iface = {
  name: 'MyUIComponent',
  propTypes: {
    ...View.propTypes // include the default view properties
  },
};

var MyUIComponent = requireNativeComponent('MyUIComponent');

/**
 * Exports
 */

module.exports = MyUIComponent;
