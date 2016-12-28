# Instructions for Contributing

* `Fork` the repo to your account
* `git clone` from your fork
* Add original repo as `upstream`
```bash
git remote add upstream https://github.com/shibli049/commons-pattern.git
```
* *Recommended:* Create a local dev branch (ex: `dev-john`) and work in that branch
* Before pushing your changes, checkout master branch and pull the latest changes from upstream
```bash
git checkout master
git pull upstream master
```
* Go back to your local dev branch (ex: `dev-john`) and `rebase` from master. Resolve any conflicts that may happen in this step
```back
git checkout dev-john
git rebase master
# resolve conflicts, if any, and commit before pushing it to github
```
* Push your changes on a new branch in your fork
```bash
git push origin dev-john:new-branch-name
```
* Finally go to the original repo and make a Pull Request if everything is ok.


# Points to remember before commit
- Add one change per one commit.
- Add one commit per one Pull Request.
- Check your spelling and grammar.
- Make sure the tests pass.
- If you add any functionality, then you should add tests for it.

# Instructions for creating Issues
* Mark the issue as either **Support**, **Feature**, **Request** or **Query** (or something else if these do not seem appropriate).

> Support: Pattern X fails to validate string Y.


* Try to give a RegEx alternate solution, if possible. :smile:



[RegEx101]: https://regex101.com/
[pastebin]: https://pastebin.com
