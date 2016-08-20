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

This will create a new local `work` branch and switch your Android Studio to this new local branch as you can see in the screenshot below:

<br>
<br>

![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/newbranch03.png)

<br>
<br>

In the background, Android Studio has used Git to created a new local `work` branch using the code snapshot from the `master` branch and automatically checks out the new local `work` branch ready for you to start making code changes on this new local `work` branch.

But, this new branch does not yet exist on the remote Github server. In other words, we now have a Local Branch called `work` but there is no "Remote Branch" called `work` yet. In order to do that, we need to Commit and **Push** our local changes to the server. Execute **Commit and Push** for the changes (new work branch) to be replicated to the (Github) server.

![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/pushedNewWorkBranch.png)

After the **Push**, you can browse the codebase of the new `work` branch on the Github website as follows:
- Logon to Github website
- Browse to your repository.
    - Your repository dashboard on Github website will show the number of branches in your repository and in this case and as shown in the screenshot below it should be **2 Branches**<br><br>
    ![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/2Branches.png)<br><br>
    - Click on **2 Branches** and then click **All Branches** to view your branches<br><br>
    ![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/allBranches.png)<br><br>

# 2 Make code changes on `work` branch, commit your changes and push your commits to the (Github) server

Now, while you are using the `work` branch, make some code changes and Commit and **Push** to the (Github) server. Note that unless you *Push*, your changes you made and commited will not be copied (pushed) to the (Github) server.

### Verify that your changes have been pushed to the `work` branch on the Github server

- Login to Github website and browse to your repository and you will find that your new code changes are not there in the default `master` branch. This is correct because we made changes and did a Commit and **Push** but we did this in the `work` branch. So, these changes should not be in the `master` branch but actually in the `work` branch.
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
    - At this point, even though it seems that your merge has been completed, but it has only been completed on your local computer and has not been pushed to the (Github) server. You can verify this by checking on the Github website and you will notice that indeed the changes from the `work` branch have not been reflected on the `master` branch on the server.
    - Now `Push` your merge to the Github server


# 5. Delete your `work` branch

Usually once a working branch is merged with the `master` branch, its purpose is done and we should delete it. One thing we need to be concious about is that we need to delete the "remote" branch on the Github server and not just the local branch on your local computer.

Following are some of the ways, you can delete a branch:
- Android Studio
    - Click on `Delete work` link in the confirmation message above
    - From the status bar, click on **Git:master** which is your current branch in Android Studio, and select **work -> origin/work** and click **Delete**<br><br>
    ![Current Weather](https://raw.githubusercontent.com/maanmehta/screenshots/master/branches/deleteWork.png)<br><br>
    - And as always, we need to Commit and **Push** all our local changes to the (Github) server, so the `work` branch gets deleted from the Github server as well
- Github website - Browse to your repository on Githb website and select the appropriate branch to delete
- Git command line

