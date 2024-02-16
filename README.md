# Ogre3D script JetBrains-plugin

This plugin enhances your coding experience by offering features such as code formatting and simple diagnostics. By highlighting errors before compilation, it helps streamline the debugging process. Furthermore, the 'go-to definition' support provided by these plugins facilitates seamless navigation through your codebase, allowing you to quickly locate and access specific elements within your files.

**Development**

This plugin utilizes an LSP underneath. Currently, the plugin employs the classes provided by the Platform Plugin SDK to handle all the client-side aspects of the LSP protocol. Only the token highlighting is performed by the plugin.

**Ogre3d script languages supported (at the moment)**

 - [x] *.material
 - [ ] *.program
 - [ ] *.particle
 - [ ] *.compositor
 - [ ] *.os
 - [ ] *.overlay

> Note: looking forward for supporting more ogre3d scripts.

## [License](./LICENSE)

## LSP server

All the code of the server can be found under the repository:
[github.com/inflagames/ogre-scripts-LSP](https://github.com/inflagames/ogre-scripts-LSP)

> The project is developed with C++, and it can be totally reviewed in case of security conserns.

## Build

If you want to build the Plugin from source, we recommend reading the documentation at: [JetBrain plugins](https://plugins.jetbrains.com/docs/intellij/welcome.html)

