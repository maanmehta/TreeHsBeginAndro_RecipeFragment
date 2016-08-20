# Basic GitHub Branch Management
## How to create and merge branches using Android Studio and Github and Git command line

### About this tutorial

This tutorial gives step-by-step instructions on how to create a new `work` branch from the `master` branch, make your code changes and commit to the `work` branch

1. Create a new `work` branch from `master` branch
2. Make code changes on `work` branch, commit your changes and push your commits to the (Github) server
3. Change (checkout) your branches between `work` and `master` and see that you get different code
4. Merge your `work` branch to `master` branch and push your changes (the merge) to the server
5. Make more changes to on `work` branch, commit your changes and push your commits to the (Github) server
6. Merge again
7. Delete your `work` branch

# 1 Create a new `work` branch from `master` branch

## Android Studio

- From the status bar at the bottom of Android Studio, click **Git:master** and then click **New Branch**
- Enter `work` as the name of the new branch and click **OK**


![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/newbranch01.png)

<br>
<br>

![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/newbranch02.png)

<br>
<br>

This will create the new `work` branch and switch your Android Studio to this new branch as you can see in the screenshot below:

<br>
<br>

![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/newbranch03.png)

<br>
<br>

In the background, Git has created a new `work` branch using the code snapshot from the `master` branch and automatically checks out the new `work` branch ready fr you to start suing the new work branch

# 1 Make code changes on `work` branch, commit your changes and push your commits to the (Github) server

Now, while you are using the `work` branch, make some code changes and commit and push to the (Github) server. Note that unless you *Push*, your changes you made and commited will not be copied (pushed) to the (Github) server.

### Verify that your changes have been pushed to the `work` branch on the Github server

- Login to Github website and browse to your repository and you will find that your new code changes are not there in the default `master` branch. This is correct because we made changes and did a commit and Push but we did this in the `work` branch. So, these changes should not be in the `master` branch but actually in the `work` branch.
- Switch to the new `work` branch on the Github website and viola, your changes are there.

<br>
<br>

![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/switchToWork01.png)




-

