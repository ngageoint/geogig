GeoGig - Geospatial Distributed Version Control System
======================================================

This is a copy of the [GeoGig](https://github.com/locationtech/geogig) project.  This version works with the [GeoGig QGIS Plugins](https://github.com/ngageoint/geogig-qgis-client-plugin) and [GeoGig WebAPI](https://github.com/ngageoint/geogig-web).  The QGIS plugin and WebAPI are NGA funded as part of the GEOINT Services program

Geogig is a middleware tool for distributed management of geospatial data.  Geogig uses common git workflows with branching.  Users are able to import raw geospatial data (Shapefiles, PostGIS, SpatiaLite, ect) in to a repository where every change to the data is tracked.

**QGIS Geogig Plugin** is used to connect QGIS to a Geogig repo for multiuser reads and edits.

**Geogig Web API** provides a REST interface to a Geogig repository allowing users to read and write data.

Latest Geogig can be downloaded from community - https://github.com/locationtech/geogig

<!-- For background reading see these two papers on the spatial distributed versioning [Concept ](http://boundlessgeo.com/whitepaper/new-approach-working-geospatial-data-part-1/),  [Implementation](http://boundlessgeo.com/whitepaper/distributed-versioning-geospatial-data-part-2/), and [Potential Development](http://boundlessgeo.com/whitepaper/distributed-versioning-geospatial-data-part-3/). -->

Details
-------

Project Lead: [Gabriel Roldan](https://github.com/groldan)

Status:

Version 1.2.0 has been released and it is available for [download](https://github.com/locationtech/geogig/releases/tag/v1.2.0).

The build is actively monitored at [LocationTech Build Server](https://hudson.locationtech.org/geogig/).

License
-------

GeoGig is proudly open source:

* Source code is distributed under an [Eclipse Distribution License (EDL)](LICENSE.txt) unless otherwise stated.
* For details on third-party dependencies review [NOTICE](NOTICE.txt)

Download
--------

The latest release [Version 1.2.0](https://github.com/locationtech/geogig/releases/tag/v1.2.0) is available on GitHub.

The previous release [Version 1.1.0](https://github.com/locationtech/geogig/releases/tag/v1.1.0) is also available on GitHub.

Installation
------------

Unzip geogig-<version>.zip to an applications directory, and then add the unzipped geogig/bin/ folder to your PATH.

Upgrading
---------

If you are upgrading from a previous version of GeoGig, please see the relevant [Upgrade Guides](http://geogig.org/upgrade/).

Running
-------

See the [QuickStart](http://geogig.org/#install) guide for an introduction to GeoGig. Additional information available at the full [Manual](http://geogig.org/docs/index.html).

Developing
----------

If you want to get involved in the development of GeoGig, build GeoGig yourself or know more about the technical details behind GeoGig, check the [developers section](https://github.com/locationtech/geogig/blob/master/doc/technical/source/developers.rst).

See [CONTRIBUTING](CONTRIBUTING.md) for details on making GitHub pull request.

Participation
-------------

[![Join the chat at https://gitter.im/locationtech/geogig](https://badges.gitter.im/locationtech/geogig.svg )](https://gitter.im/locationtech/geogig?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Everyone is invited to participate in GeoGig and help in its development. Check the [How to help ](https://github.com/locationtech/geogig/blob/master/helping.rst) section to read about how you can help us improve GeoGig.
