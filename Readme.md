# Basic GitHub Branch Management
## How to create and merge branches using Android Studio and Github and Git command line

### About this tutorial

This tutorial gives step-by-step instructions on how to create a new `work` branch from the `master` branch, make your code changes and commit to the `work` branch

1. Create a new `work` branch from `master` branch
2. Make code changes on `work` branch, commit your changes and push your commits to the (Github) server
3. Change (checkout) your branches between `work` and `master` and see that you get different code
4. Merge your `work` branch to `master` branch and push your changes (the merge) to the server
5. Delete your `work` branch

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

# 2 Make code changes on `work` branch, commit your changes and push your commits to the (Github) server

Now, while you are using the `work` branch, make some code changes and commit and push to the (Github) server. Note that unless you *Push*, your changes you made and commited will not be copied (pushed) to the (Github) server.

### Verify that your changes have been pushed to the `work` branch on the Github server

- Login to Github website and browse to your repository and you will find that your new code changes are not there in the default `master` branch. This is correct because we made changes and did a commit and Push but we did this in the `work` branch. So, these changes should not be in the `master` branch but actually in the `work` branch.
- Switch to the new `work` branch on the Github website and viola, your changes are there.

<br>
<br>

![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/switchToWork01.png)

<br>
<br>


# 3. Change (checkout) your branches between `work` and `master` and see that you get different code

- Switch your branches on the Github website and you will notice the differences int he code base between the `work` and the `master` branch.
- You can do the same on Android Studio as follows
    - Switch your active branch on Android Studio back to `master` - From the status bar, click on **Git:work** which is your current branch in Android Studio, and select **master -> origin/master** and click **Checkout**. You can now verify that the code base in Android Studio shows your code that was in `master` branch and does not have the changes you made and commited to the `work` branch.<br><br>
    ![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/checkoutMaster01.png)<br><br>
    ![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/checkedoutMaster01.png)<br><br>
    - Now, switch back to the `work` branch on Android Studio - From the status bar, click on **Git:master** which is your current branch in Android Studio, and select **work -> origin/work** and click **Checkout**. You can now verify that the code base in Android Studio shows your code that is in the `work` branch and has all the changes you made and commited to the `work` branch.<br><br>
    ![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/checkoutWork01.png)<br><br>
    ![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/checkedoutWork01.png)<br><br>

# 4. Merge your `work` branch to `master` branch and push your changes (the merge) to the server

When you want to merge your code changes from branch B to branch A, you have to switch (checkout) to branch A and then execute the merge command and select Branch B. Git will then marge the current codebase of the Branch B to Branch A. And now, the codebase of branches A and B will be same. Keep in mind, at this point, all of this merge has been done to your branches A and B that are local to your computer and has not been pushed tot he (Github) server. Therefore, you will need to execute a Push from your local computer (e.g. your Android Studio). Here are the steps that you can execute to merge ll the commits you have made on your `work` branch to the `master` branch:

- Switch your branches on the Github website and you will notice the differences in the code base between the `work` and the `master` branch.
- You can do the same on Android Studio as follows:
    - Switch your active branch on Android Studio back to `master` - From the status bar, click on **Git:work** which is your current branch in Android Studio, and select **master -> origin/master** and click **Checkout**
    - Now execute merge of `work` branch to the `master` branch as follows - From the status bar, click on **Git:master** which is your current branch in Android Studio, and select **work -> origin/work** and click **Merge**<br><br>
    ![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/merge01.png)<br><br>
    ![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/mergedWorkToMaster01.png)<br><br>



