# ern-walmart-manifest

A shared [Electrode Native Manifest][1] for use with applications that depend
on _internal_ Walmart dependencies.

## Usage

The intended usage is as a **partial override** of the default open source
[electrode-native-manifest][2] which contains all supported _public_ plugins.

See [Override][3] for options on how to set an override manifest. In most
cases, adding the following config to a [Cauldron][4]:

```json
"config": {
  "manifest": {
    "override": {
      "url": "https://gecgithub01.walmart.com/electrode-mobile-platform/ern-walmart-manifest.git",
      "type": "partial"
    }
  }
}
```

## Supported Plugins

### `@walmart/react-native-sso`

This module adds support for the newer Walmart single sign-on (SSO) libraries,
also known as 2.0/Pingfed. On the native side, it uses the following libraries
implemented by the Store Systems Mobile Platform team:

- Android: [store-sso-pingfed-android][13]
- iOS: [store-sso-pingfed-ios][14]

See the [SSO 2.0 landing page][11] for additional details and integration steps,
as well as [ernsso-miniapp][12] for an example Electrode Native miniapp.

[11]: http://amp.docs.walmart.com/sso2.0/index.html
[12]: https://gecgithub01.walmart.com/electrode-mobile-platform/ernsso-miniapp
[13]: https://gecgithub01.walmart.com/store-systems-associate-tech-platform/store-sso-pingfed-android
[14]: https://gecgithub01.walmart.com/store-systems-associate-tech-platform/store-sso-pingfed-ios

### `@walmart/react-native-webview`

An internal mirror of the open source [react-native-webview][5] repo, with
a simplified and optimized dependency structure. See [README.md][6] for more
information.

### `react-native-httpapi`

A request processor for http network calls used by [gifpicking][9].

Repo for `react-native-http[-]api` hosted at:
[RT-Integrated-Fulfillment/gif-ui-http-api][10]

### `react-native-wm-barcode`

A module to abstract various scanner interfaces into one common set of functions
and events.

Documentation for usage and integration in the [wm-barcode-scanner][7] repo.

### `react-native-wmsso`

A library to support single sign on with Walmart credentials.

Documentation for usage and integration in the [single-sign-on][8] repo.

[1]: https://native.electrode.io/reference/index-3
[2]: https://github.com/electrode-io/electrode-native-manifest
[3]: https://native.electrode.io/reference/index-3/override
[4]: https://native.electrode.io/reference/index-2
[5]: https://github.com/react-native-webview/react-native-webview
[6]: https://gecgithub01.walmart.com/electrode-mobile-platform/react-native-webview/tree/custom-10.3.2#begin-walmart-custom
[7]: https://gecgithub01.walmart.com/Store-Mobility-Services/wm-barcode-scanner/tree/master/react
[8]: https://gecgithub01.walmart.com/Store-Mobility-Services/single-sign-on
[9]: https://gecgithub01.walmart.com/RT-Integrated-Fulfillment/gifpicking
[10]: https://gecgithub01.walmart.com/RT-Integrated-Fulfillment/gif-ui-http-api/
