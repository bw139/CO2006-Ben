<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Primer/3.0.1/css/primer.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/octicons/3.5.0/octicons.min.css">

# IDE and Tooling

The tools that need to be installed in your machine in order to do the exercises for CO2006 18-19 are:
* Java 8
* Gradle 4.9+
* The Spring Tool Suite (STS) 3.9.5 (on Eclipse 4.8 - Photon)
* Groovy 2.4 (**neither 2.5 or 3**)
* Gradle Buildship 2.0

## Installation guide

A screencast describing how to install the STS, Groovy and Gradle is available :movie_camera: [here](https://leicester.cloud.panopto.eu/Panopto/Pages/Viewer.aspx?id=73fd365a-e6d1-4eb1-abbf-a96b01052e09). 
* :warning: Please choose the versions mentioned above when following the instructions in the video.

Further considerations on the tools that we are going to use in CO2006 are described below.

### Gradle

* [Install Gradle 4.9+](https://docs.gradle.org/current/userguide/installation.html)

### Java 8

* Download Java 8 from [Oracle's website](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
* Install it.

### Spring Tool Suite (STS) 

* Download the Spring Tool Suite (STS) 3.9.5 available from [the Spring website](https://spring.io/tools).
* Unzip and move to:
  * Mac OS: `Applications` 
    * In some cases, you may not be able to install Groovy plugins, with the error being that you don't have write permissions on the installation folder. If you drag and drop the STS file to the `Applications` folder, you may be able to install the plugins.
  * Windows: `Program Files`
    * Use 7-zip ([http://www.7-zip.org](http://www.7-zip.org)) to unzip the zipped file that you get when you download the STS.
    * Some students could not install the STS under the folder `Program Files`. If that is your case, try to install the STS in another folder, e.g. in `My Documents`. 
  * Linux: your folder of choice

### Groovy

* From within STS (launch it first).
* `Help > Dashboard` (from Spring perspective).
* `Manage > IDE extensions`.
* Select:
  * `Groovy 2.4 compiler for Groovy-Eclipse`;
  * `Groovy-Eclipse`;
  * `Groovy-Eclipse Configurator for M2Eclipse`.
* Click `Install` and follow the instructions.

### Gradle

* From within STS (launch it first).
* `Help > Eclipse Marketplace`.
* Search for `Buildship Gradle Integration 2.0`.
* Install it and follow the instructions.


### MySQL Workbench

Download the last version of MySQL Workbench from [here](https://dev.mysql.com/downloads/workbench/).

### For users of MS Windows 10

Install [Bash terminal](https://www.howtogeek.com/249966/how-to-install-and-use-the-linux-bash-shell-on-windows-10/) to run commands as in a Linux (Bash) terminal in the lab.
