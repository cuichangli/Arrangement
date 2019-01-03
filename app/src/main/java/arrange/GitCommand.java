package arrange;

/**
 * 创建者     ideal
 * 创建时间   2019/1/3 14:35
 * 描述	     github 命令
 * 更新描述   $$$$
 */
public class GitCommand {
    /** 1.创建版本库,--选择合适的地方，创建一个空目录
     *    例如：我需要在G盘创建一个Ideal 的目录。
     *    clear           清空界面
     *
     *    cd g             //切换到g盘
     *    mkdir Ideal      //创建文件夹
     *    cd Ideal         //切换到创建的文件夹
     *    pwd              //显示当前目录
     *    git init         //把目录变成git可以管理的仓库，不过是一个空仓库
     *
     *2.添加文件
     *
     *    git add command.txt                      //添加文件到仓库，没有任何提示
     *    git commit -m "there is a description"   //提交文件到仓库，添加注释
     *
     * 3.查看日志
     *    git log 显示从最近到最远的提交日志，
     *    git log --pretty=oneline 加上参数，为了看的更加清晰。commit id不是1、2、3，而是一大串数字。
     *
     * 4. 版本回退
     *    git reset --hard HEAD  ，HEAD表示当前版本，上一个版本HEAD^，上上一个版本HEAD^^，再往上HEAD~100
     *    git reset --hard 1094a ,版本号1094a，前几位就可以了，可以不用写全，git会自动去找。
     *    git reflog              记录每一次的命令，在找不到版本号时使用。
     *
     * 5. 时光穿梭机
     *    git status              查看状态
     *    cat <file>              查看文件
     *    git diff HEAD -- <file> 可以查看工作区和版本库里面最新版本的区别。
     *    git checkout -- <file>   把文件在工作区的修改全部撤销。让这个文件回到最近一次git commit或git add时的状态
     *
     *    rm <file>                删除文件。
     *    git rm <file>            从版本库删除
     *    git commit -m "remove file"         提交删除
     *
     *6.远程仓库
     *    在github创建同名仓库
     *    git remote add origin git@github.com:cuichangli/Ideal.git   //关联远程仓库。
     *    git push -u origin master                                   //首次把本地内容推送到远程仓库
     *    git push origin master                                      //把本地内容提交远程仓库
     *    git clone git@github.com:cuichangli/Ideal.git               //克隆远程仓库到本地
     *    git clone https://github.com/cuichangli/Arrangement.git     //克隆远程仓库到本地https:
     *7.分支管理
     *    git branch            //查看分支，当前分支用* 标识
     *    git branch dev        //创建分支
     *    git checkout master   //切换分支，master也是主线
     *    git checkout -b dev   //创建+切换到分支, 相当于git branch dev 和git checkout dev;
     *    git merge dev         //合并某分支到当前分支，这次合并是“快进模式”
     *    git branch -d dev     //删除分支
     *    git log --graph       //可以看到分支合并图
     *    git merge --no-ff -m "merge with no-ff" dev //准备合并dev分支，请注意--no-f参数，表示禁用Fast forward.
     *    git log --graph --pretty=oneline --abbrev-commit  //查看分支历史
     *7.1 bug分支
     *    git stash 把当前工作现场储藏起来，等以后恢复现场后继续工作。用于先修改主线bug.
     *
     *    git stash list 切换回分之后，查看需要恢复的工作现场
     *    git stash pop ,恢复的同时把stash内容也删除了。相当于git stash apply恢复和git stash drop 删除
     *    git stash apply stash@{0}   多次使用stash,恢复的时候，先用git stash list查看，然后恢复指定的stash.
     *    git branch -D feature-vulcan  大写D强行删除分支
     *8.多人写作
     *    git remote 查看远程库的信息
     *    git remote 查看远程库更详细的信息
     *    git push origin master //推送分支到远程仓库 ，如果推送dev，需要改成git push origin dev
     *    git checkout -b dev origin/dev   远程origin的dev分支到本地
     *    cat env.txt               查看内容
     *    git pull    把最新的提交从origin/dev抓下来，然后在本地合并，解决冲突再提交
     *    多人协作的工作模式通常是这样：
     *
     *   首先，可以试图用git push origin <branch-name>推送自己的修改；
     *   如果推送失败，则因为远程分支比你的本地更新，需要先用git pull试图合并；
     *   如果合并有冲突，则解决冲突，并在本地提交；
     *   没有冲突或者解决掉冲突后，再用git push origin <branch-name>推送就能成功！
     *   如果git pull提示no tracking information，则说明本地分支和远程分支的链接关系没有创建，用命令git branch --set-upstream-to <branch-name>
     *     origin/<branch-name>。
     *
     *8.标签管理
     *  git tag v1.0  打一个新标签
     *  git tag 查看所有标签
     *  忘记打标签的处理方式：
     *     找到历史提交的Commit id ,然后打上标签
     *  git tag v0.9 f52c633
     *  git show v0.9  可以用git show <tagname>查看标签信息
     *  git tag -a v0.1 -m "version 0.1 released" 1094adb  创建带有说明的标签，用-a指定标签名，-m指定说明文字：
     *  git tag -d v0.1  删除标签
     *  git push origin v1.0   如果要推送某个标签到远程，使用命令git push origin <tagname>
     *  git push origin --tags  一次性推送全部尚未推送到远程的本地标签
     *
     *  git tag -d v0.9   如果标签已经推送到远程，要删除远程标签就麻烦一点，先从本地删除
     *  git push origin :refs/tags/v0.9  然后，从远程删除。删除命令也是push，但是格式如下
     **/

    /** 整理：
     * 1.初始化仓库：git init
     *
     * 2.添加文件到仓库，分两步
     *
     *    使用命令 git add <file>,注意，可反复多次使用，添加多个文件；
     *
     *    使用命令 git commit -m <message>,完成。
     *
     * 3.HEAD指向的版本就是当前版本。因此git允许我们再版本的历史之间穿梭，使用命令git reset --hard commit-id.
     *
     *    穿梭前，用git log可以查看提交历史，以便确定要回退到哪个版本。
     *
     *    要重返未来，用git reflog查看命令历史，以便确定要回到未来的哪个版本。
     *
     * 4.场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令git checkout -- file。
     *
     *
     *    场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，第一步用命令git reset HEAD <file>，就回到了场景1，第二步按场景1操作。
     *
     *
     *    场景3：已经提交了不合适的修改到版本库时，想要撤销本次提交，参考版本回退一节，不过前提是没有推送到远程库。
     *
     * 5.要关联一个远程库，使用命令git remote add origin git@server-name:path/repo-name.git；
     *
     *    关联后，使用命令git push -u origin master第一次推送master分支的所有内容；
     *
     *    此后，每次本地提交后，只要有必要，就可以使用命令git push origin master推送最新修改；
     *
     * 6.分支策略
     *
     *   在实际开发中，我们应该按照几个基本原则进行分支管理：
     *   首先，master分支应该是非常稳定的，也就是仅用来发布新版本，平时不能在上面干活；
     *   那在哪干活呢？干活都在dev分支上，也就是说，dev分支是不稳定的，到某个时候，比如1.0版本发布时，再把dev分支合并到master上，在master分支发布1.0版本；
     *   你和你的小伙伴们每个人都在dev分支上干活，每个人都有自己的分支，时不时地往dev分支上合并就可以了。
     *   所以，团队合作的分支看起来就像这样：https://www.liaoxuefeng
     *      .com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000/0013758410364457b9e3d821f4244beb0fd69c61a185ae0000
     *
     * 7.查看远程库信息，使用git remote -v；
     *    本地新建的分支如果不推送到远程，对其他人就是不可见的；
     *    从本地推送分支，使用git push origin branch-name，如果推送失败，先用git pull抓取远程的新提交；
     *    在本地创建和远程分支对应的分支，使用git checkout -b branch-name origin/branch-name，本地和远程分支的名称最好一致；
     *    建立本地分支和远程分支的关联，使用git branch --set-upstream branch-name origin/branch-name；
     *    从远程抓取分支，使用git pull，如果有冲突，要先处理冲突。
     *
     * 8.命令git tag <tagname>用于新建一个标签，默认为HEAD，也可以指定一个commit id；
     *     命令git tag -a <tagname> -m "blablabla..."可以指定标签信息；
     *     命令git tag可以查看所有标签。
     *
     * 9.命令git push origin <tagname>可以推送一个本地标签；
     *    命令git push origin --tags可以推送全部未推送过的本地标签；
     *    命令git tag -d <tagname>可以删除一个本地标签；
     *    命令git push origin :refs/tags/<tagname>可以删除一个远程标签。
     * */
}
