# dependant-bot-check-for-clojure

A Clojure library designed to ... well, that part is up to you.

## Usage

Info about `schedule`
https://docs.github.com/en/actions/learn-github-actions/events-that-trigger-workflows#schedule

Cron
https://crontab.cronhub.io/

Configuration for PAT
https://dev.to/kengotoda/a-complete-guide-to-use-dependabot-with-semantic-release-and-vercel-ncc-for-github-actions-230p
https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token

```clojure
(defn ver [] (-> "./resources/dependant-bot-check-for-clojure.version" slurp .trim))
```

## License

Copyright © 2021 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
