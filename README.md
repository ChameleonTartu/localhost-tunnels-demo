This source code is part of the presentation about secure localhost tunneling.

It has 3 endpoints:

`GET /callbacks` - Receive list of registered callbacks

`POST /register?callback=<value>` - Register callback URL

`DELETE /unregister?callback=<value>` - Unregister callback URL

The setup is ready for Heroku deployment

To do it, you will need to run:

`heroku login` - Login to your Heroku account, or create a new one

`heroku local web` - Run locally to see that everything works

`heroku create` - Create new heroku app, it should automatically assign URL under `heroku` remote repo

`git push heroku master` - To deploy to Heroku, in newly created app

`heroku logs --tail` - To follow the logs, see misconfigurations and general debug info

