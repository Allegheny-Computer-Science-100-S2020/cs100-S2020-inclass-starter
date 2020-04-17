# cs100-S2020-inclass-starter

## Table of Contents

* [Table of Contents](#table-of-contents)
* [Introduction](#introduction)
* [Continuous Learning](#continuous-learning)
* [System Commands](#system-commands)
  + [Using Docker](#using-docker)
  + [Using Gradle](#using-gradle)
* [Expected Program Output](#expected-program-output)
* [Automated Checks with GatorGrader](#automated-checks-with-gatorgrader)
* [Downloading Project Updates](#downloading-project-updates)
* [Using Travis CI](#using-travis-ci)
* [System Requirements](#system-requirements)
* [Reporting Problems](#reporting-problems)
* [Receiving Assistance](#receiving-assistance)
* [Project Assessment](#project-assessment)

## Introduction

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter for the in-class programming that you will do in
Computer Science 100. Since the Travis builds for this repository will initially
fail (as evidenced by a red &#x2717; appearing in the commit logs instead of a
green &#x2714;), the programmer is responsible for completing all of the steps
needed to satisfy the requirements for the in-class programming project, thus
causing a &#x2714; to instead appear in the commit logs. All of the work that
you do for your in-class assignments will count towards your class participation
grade. The course instructor will regularly check the status of the build in
this repository and you will earn a checkmark grade if, upon inspection, your
repository has a green &#x2714; appearing in the GitHub commit log.

## Continuous Learning

If you have not done so already, please read all of the relevant [GitHub
Guides](https://guides.github.com/) that explain how to use many of the features
that GitHub provides. In particular, please make sure that you have read the
following GitHub guides: [Mastering
Markdown](https://guides.github.com/features/mastering-markdown/), [Hello
World](https://guides.github.com/activities/hello-world/), and [Documenting Your
Projects on GitHub](https://guides.github.com/features/wikis/). Each of these
guides will help you to understand how to use both [GitHub](http://github.com) and
[GitHub Classroom](https://classroom.github.com/).

Students who want to learn more about how to use
[Docker](https://www.docker.com) should review the [Docker
Documentation](https://docs.docker.com/). Students are also encouraged to review
the documentation for their text editor, which is available for text editors
like [Atom](https://atom.io/docs) and [VS
Code](https://code.visualstudio.com/docs). You should also review the [Git
documentation](https://git-scm.com/doc) to learn more about how to use the Git
command-line client. In addition to talking with the instructor and technical
leader for your course, students are encouraged to search
[StackOverflow](https://stackoverflow.com/) for answers to their technical
questions.

## System Commands

This project invites students to enter system commands into a terminal window.
This assignment uses [Docker](https://www.docker.com) to deliver programs, such
as `gradle` and the source code and packages needed to run
[GatorGrader](https://github.com/GatorEducator/gatorgrader), to a students'
computer, thereby eliminating the need for a programmer to install them on their
development workstation. Individuals who do not want to install Docker can
optionally install of the programs mentioned in the [Project
Requirements](#requirements) section of this document.

### Using Docker

Once you have installed [Docker
Desktop](https://www.docker.com/products/docker-desktop), you can use the
following `docker run` command to start `gradle grade` as a containerized
application, using the [DockaGator](https://github.com/GatorEducator/dockagator)
Docker image available on
[DockerHub](https://cloud.docker.com/u/gatoreducator/repository/docker/gatoreducator/dockagator).

```bash
docker run --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator
```

The aforementioned command will use `"$(pwd)"` (i.e., the current working
directory) as the project directory and `"$HOME/.dockagator"` as the cached
GatorGrader directory. Please note that both of these directories must exist,
although only the project directory must contain something. Generally, the
project directory should contain the source code and technical writing for this
assignment, as provided to a student by the instructor through GitHub.
Additionally, the cache directory should not contain anything other than
directories and programs created by DockaGator, thus ensuring that they are not
otherwise overwritten during the completion of the assignment. To ensure that
the previous command will work correctly, you should create the cache directory
by running the command `mkdir $HOME/.dockagator` on the MacOS and Linux
operating systems. However, if you are using the Windows operating system then
you will instead need to type the command `mkdir
%HomeDrive%%HomePath%/.dockagator`. Finally, if the above `docker run` command
does not work correctly on the Windows operating system, you may need to instead
run the following command to adapt to the differences in the `cmd` terminal
window:

```bash
docker run --rm --name dockagator \
  -v "%cd%:/project" \
  -v "%HomeDrive%%HomePath%/.dockagator:/root/.local/share" \
  gatoreducator/dockagator
```

Here are some additional commands that you may need to run when using Docker:

* `docker info`: display information about how Docker runs on your workstation
* `docker images`: show the Docker images installed on your workstation
* `docker container list`: list the active images running on your workstation
* `docker system prune`: remove many types of "dangling" components from your workstation
* `docker image prune`: remove all "dangling" docker images from your workstation
* `docker container prune`: remove all stopped docker containers from your workstation
* `docker rmi $(docker images -q) --force`: remove all docker images from your workstation

### Using Gradle

Since the above `docker run` command uses a Docker images that, by default, runs
`gradle grade` and then exits the Docker container, you may want to instead run
the following command so that you enter an "interactive terminal" that will
allow you to repeatedly run commands within the Docker container.

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

Once you have typed this command, you can use the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) in the Docker container by
typing the command `gradle grade` in your terminal. Running this command will
produce a lot of output that you should carefully inspect. If GatorGrader's
output shows that there are no mistakes in the assignment, then your source code
and writing are passing all of the automated baseline checks. However, if the
output indicates that there are mistakes, then you will need to understand what
they are and then try to fix them.

You can also complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is correct) the program using the command `gradle
build`. Here are some other commands that you can type:

* `gradle grade`: run the [GatorGrader](https://github.com/GatorEducator/gatorgrader) tool to check your work
* `gradle clean`: clean the project of all the derived files
* `gradle check`: check the quality of the code using Checkstyle
* `gradle build`: create the bytecode from the Java source code
* `gradle run`: run the Java program in the command-line
* `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (i.e., "home base")
directory for this assignment where the `build.gradle` file is located.

There are separate Gradle commands that you must type for each of the individual
in-class programs that you will want to run. Here is the list of commands to
type:

- `gradle runExploreDataTypes`: Run the `inclass.ExploreDataTypes` program
- `gradle -q --console plain runComputeGasMileage`: Run the `inclass.ComputeGasMileage` program
- `gradle runPerformStringMutation`: Run the `inclass.PerformStringMutation` program
- `gradle -q --console plain runCompareInputValues` to run the `inclass.CompareInputValues` program
- `gradle -q --console plain runComputeAverage` to run the `inclass.ComputeAverage` program
- `gradle -q --console plain runComputeMultiples` to run the `inclass.ComputeMultiples` program
- `gradle runDisplayStars`: Run the `inclass.DisplayStars` program
- `gradle runBasicArrayComputations`: Run the `inclass.BasicArrayComputations` program
- `gradle -q --console plain runReverseNumberList`: Run the `inclass.ReverseNumberList` program

## Expected Program Output

As you complete the in-class programming assignments, you will see that they
each produce different output. The following list shows the output from running
some of the programs that you complete during class activities. Please note that
some of the programs require user input and thus their output is not given here.

- `gradle runExploreDataTypes`:

```
> Configure project :
Configured GatorGradle 0.4.4

> Task :runExploreDataTypes
Gregory M. Kapfhammer Wed Sep 11 11:02:03 EDT 2019
Age: 19
Pi: 3.14159265358979
Weight: 122.5
```

- `gradle -q --console plain runComputeGasMileage`:

```
Enter the number of miles: 50
Enter the gallons of fuel used: 245
Miles per gallon: 0.20408163265306123
```

- `gradle runPerformStringMutation`:

```
> Configure project :
Configured GatorGradle 0.4.4

> Task :runPerformStringMutation
Original string: "Change is inevitable"
Length of string: 20
Mutation #1: Change is inevitable, except from vending machines.
Mutation #2: CHANGE IS INEVITABLE, EXCEPT FROM VENDING MACHINES.
Mutation #3: CHANGX IS INXVITABLX, XXCXPT FROM VXNDING MACHINXS.
Mutation #4: NGX IS INXVITABLX, XXCXPT F
Mutated length: 27

BUILD SUCCESSFUL in 894ms
2 actionable tasks: 1 executed, 1 up-to-date
```

- `gradle runDisplayStars`:

```
> Configure project :
Configured GatorGradle 0.5.1

> Task :runDisplayStars
*
**
***
****
*****
******
*******
********
*********
**********

BUILD SUCCESSFUL in 838ms
2 actionable tasks: 1 executed, 1 up-to-date
```

- `gradle runBasicArrayComputations`

```
> Task :runBasicArrayComputations
0  10  20  30  40  999  60  70  80  90  100  110  120  130  140

BUILD SUCCESSFUL in 1s
2 actionable tasks: 1 executed, 1 up-to-date
```

- `gradle runCompareInputValues` will produce different output depending on your input
- `gradle runComputeAverage` will produce different output depending on your input
- `gradle runComputeMultiples` will produce different output depending on your input
- `gradle runReverseNumberList` will produce different output depending on your input

## Automated Checks with GatorGrader

All of the source code and technical writing in your repository must pass the
following checks that
[GatorGrader](https://github.com/GatorEducator/gatorgrader) automatically
assesses:

- The BasicArrayComputations.java in src/main/java/inclass has at least 15 single-line Java comment(s)
- The BasicArrayComputations.java in src/main/java/inclass has at least 3 multiple-line Java comment(s)
- The BasicArrayComputations.java in src/main/java/inclass has exactly 0 of the `Add Your Name Here` fragment
- The BasicArrayComputations.java in src/main/java/inclass has exactly 0 of the `TODO` fragment
- The command `gradle build` executes correctly
- The command `gradle -q --console plain runDisplayStars` executes correctly
- The command `gradle -q --console plain runExploreDataTypes` executes correctly
- The command `gradle -q --console plain runPerformStringMutation` executes correctly
- The command output has exactly 10 lines
- The command output has exactly 1 lines
- The command output has exactly 4 lines
- The CompareInputValues.java in src/main/java/inclass has exactly 0 of the `Add Your Name Here` fragment
- The CompareInputValues.java in src/main/java/inclass has exactly 0 of the `TODO` fragment
- The ComputeAverage.java in src/main/java/inclass has exactly 0 of the `Add Your Name Here` fragment
- The ComputeAverage.java in src/main/java/inclass has exactly 0 of the `TODO` fragment
- The ComputeGasMileage.java in src/main/java/inclass has at least 2 multiple-line Java comment(s)
- The ComputeGasMileage.java in src/main/java/inclass has at least 4 single-line Java comment(s)
- The ComputeGasMileage.java in src/main/java/inclass has exactly 0 of the `Add Your Name Here` fragment
- The ComputeGasMileage.java in src/main/java/inclass has exactly 0 of the `TODO` fragment
- The ComputeGasMileage.java in src/main/java/inclass has exactly 1 of the `nextDouble` fragment
- The ComputeGasMileage.java in src/main/java/inclass has exactly 1 of the `nextInt` fragment
- The ComputeGasMileage.java in src/main/java/inclass has exactly 1 of the `System.out.println(` fragment
- The ComputeGasMileage.java in src/main/java/inclass has exactly 2 of the `System.out.print(` fragment
- The ComputeMultiples.java in src/main/java/inclass has at least 20 single-line Java comment(s)
- The ComputeMultiples.java in src/main/java/inclass has at least 3 multiple-line Java comment(s)
- The ComputeMultiples.java in src/main/java/inclass has exactly 0 of the `Add Your Name Here` fragment
- The ComputeMultiples.java in src/main/java/inclass has exactly 0 of the `TODO` fragment
- The DisplayStars.java in src/main/java/inclass has at least 10 single-line Java comment(s)
- The DisplayStars.java in src/main/java/inclass has at least 2 multiple-line Java comment(s)
- The DisplayStars.java in src/main/java/inclass has exactly 0 of the `Add Your Name Here` fragment
- The DisplayStars.java in src/main/java/inclass has exactly 0 of the `TODO` fragment
- The ExploreDataTypes.java in src/main/java/inclass has at least 2 multiple-line Java comment(s)
- The ExploreDataTypes.java in src/main/java/inclass has at least 2 single-line Java comment(s)
- The ExploreDataTypes.java in src/main/java/inclass has exactly 0 of the `Add Your Name Here` fragment
- The ExploreDataTypes.java in src/main/java/inclass has exactly 0 of the `TODO` fragment
- The ExploreDataTypes.java in src/main/java/inclass has exactly 1 of the `import java.util.Date` fragment
- The ExploreDataTypes.java in src/main/java/inclass has exactly 1 of the `new Date()` fragment
- The ExploreDataTypes.java in src/main/java/inclass has exactly 4 of the `System.out.println(` fragment
- The file BasicArrayComputations.java exists in the src/main/java/inclass directory
- The file CompareInputValues.java exists in the src/main/java/inclass directory
- The file ComputeAverage.java exists in the src/main/java/inclass directory
- The file ComputeGasMileage.java exists in the src/main/java/inclass directory
- The file ComputeMultiples.java exists in the src/main/java/inclass directory
- The file DisplayStars.java exists in the src/main/java/inclass directory
- The file ExploreDataTypes.java exists in the src/main/java/inclass directory
- The file PerformStringMutation.java exists in the src/main/java/inclass directory
- The file ReverseNumberList.java exists in the src/main/java/inclass directory
- The PerformStringMutation.java in src/main/java/inclass has exactly 0 of the `Add Your Name Here` fragment
- The PerformStringMutation.java in src/main/java/inclass has exactly 0 of the `TODO` fragment
- The ReverseNumberList.java in src/main/java/inclass has at least 12 single-line Java comment(s)
- The ReverseNumberList.java in src/main/java/inclass has at least 2 multiple-line Java comment(s)
- The ReverseNumberList.java in src/main/java/inclass has exactly 0 of the `Add Your Name Here` fragment
- The ReverseNumberList.java in src/main/java/inclass has exactly 0 of the `TODO` fragment

## Downloading Project Updates

If GatorGrader's maintainers push updates to this sample assignment and you
received it through GitHub Classroom and you would like to also receive these
updates, then you can type this command in the main directory for this
assignment:

```
git remote add download git@github.com:Allegheny-Computer-Science-100-S2020/cs100-S2020-inclass-starter.git
```

You should only need to type this command once; running the command additional
times may yield an error message but will not negatively influence the state of
your Git repository. Now, you are ready to download the updates provided by the
GatorGrader maintainers by typing this command:

```
git pull download master
```

This second command can be run whenever the maintainers needs to provide you
with new source code for this assignment. However, please note that, if you have
edited the files that we updated, running the previous command may lead to Git
merge conflicts. If this happens, you may need to manually resolve them with the
help of the instructor or a student technical leader. Finally, please note that
the [Gradle plugin](https://github.com/GatorEducator/gatorgradle) for
[GatorGrader](https://github.com/GatorEducator/gatorgrader) will automatically
download the newest version of GatorGrader.

Please note that sometimes you may need to type the following command instead:

```
git pull download master --allow-unrelated-histories
```

After running this command in your terminal window, you may need to resolve the
merge conflicts by interactively accepting the correct changes in Atom. Please
make sure that you accept the new changes provided by the course instructor,
thereby ensuring that you receive a new Java program and new configurations that
enable the automated assessment of that new Java program.

## Using Travis CI

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run
[GatorGrader](https://github.com/GatorEducator/gatorgrader) and additional
checking programs every time you commit to your GitHub repository. The checking
will start as soon as you have accepted the assignment &mdash; thus creating your own
private repository &mdash; and the course instructor and/or GitHub enables Travis for
it. If you are using Travis for the first time, you will need to authorize
Travis CI to access the private repositories that you created on GitHub. If you
do not see either a yellow &#9679; or a green &#x2714; or a red &#x2717; in your
listing of commits, then please ask the instructor to see whether or not
Travis CI was correctly enabled.

## System Requirements

We developed this assignment to work with the following software and versions:

- Docker Desktop
- Operating Systems
  - Linux
  - MacOS
  - Windows 10 Pro
  - Windows 10 Enterprise
- Programming Language Tools
  - Gradle 5.4
  - MDL 0.5.0
  - OpenJDK 11.0.4
  - Proselint 0.10.2
  - Python 3.6 or 3.7

## Reporting Problems

If you have found a problem with this assignment's provided source code or
documentation, then you can go to the [Computer Science 100 Spring 2020
In-Class](https://github.com/Allegheny-Computer-Science-100-S2020/cs100-S2020-inclass-starter)
repository and [raise an
issue](https://github.com/Allegheny-Computer-Science-100-S2020/cs100-S2020-inclass-starter/issues).
If you have found a problem with the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks
your assignment, then you can also [raise an
issue](https://github.com/GatorEducator/gatorgrader/issues) in that repository.
To ensure that your issue is properly resolved, please provide as many details
as is possible about the problem that you experienced. If you discover a problem
with the assignment sheet for this project, then please raise an issue in the
GitHub repository that provides the assignment sheets for your course.

Whenever possible, individuals who find, and use the appropriate GitHub issue
tracker to correctly document, a mistake in any aspect of this assignment will
receive free [GitHub stickers](https://octodex.github.com/) and extra credit
towards their grade for the project.

## Receiving Assistance

If you are having trouble completing any part of the in-class programming
projects, then please talk with either the course instructor or a student
technical leader during the course session. Alternatively, you may ask questions
in the Slack workspace for this course. Finally, you can schedule a meeting
during the course instructor's office hours.

## Project Feedback

Students who wish to receive feedback on their work for this in-class
programming assignment should first open an issue on the issue tracker for this
GitHub repository, giving an appropriate title and description for the type of
feedback that you would like the course instructor to provide. After creating
this issue, you will see that GitHub has created a unique web site that
references this issue. To alert the course instructor to the fact that the
issue was created and that you want feedback on your work, please send it to
him by a Slack direct message at your earliest convenience, bearing in mind
that the in-class programming projects have more informal deadlines for
completion. After the instructor responds to the issue, please resolve all of
the stated concerns and participate in the discussion until the issue is
closed.
