# HelloWorldCompose

This is a simple Jetpack Compose project for
 understanding GitHub Actions and how to
 create YML workflows.

## Features
- Gradle 8.14, AGP 8.10.0, OpenJDK 21
- Uses Kotlin and Jetpack Compose

## How to Use 
I installed git on my phone and set up the SSH key.
- Create new one or fork this project.
- Get the *.git link.
- Configure git
```
git config --global user.name "Your Name"
git config --global user.email "you@example.com"
```
- Initialize git
```
cd /path/to/your/project
git init
```
- Add and commit files
```
git add .
git commit -m "Initial commit"

```
- Add the remote repository
```
git remote add origin git@github.com:your-username/my-project.git
git branch -M main
```
- Push (next pushes can be just `git push`)
```
git push --set-upstream origin main
```
- Before you push, set the access
```
ssh-keygen -t ed25519 -C "your_email@example.com"
```
```
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_ed25519
```
- Copy entire output and add to github-settings-keys
```
cat ~/.ssh/id_ed25519.pub
```

- When you are done to add github keys, test the connection
```
ssh -T git@github.com
```

- If there is no graddle wrapper in your project,
workflow will create that, but it need permission.
GitHub -> Your Project -> Settings -> Actions
-> General Settings -> Workflow Permissions
	give read and write permission and check
	the box about pull requests
