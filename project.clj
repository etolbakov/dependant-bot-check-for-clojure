(defproject dependant-bot-check-for-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :repositories [["test-pr-repo" {:url "https://maven.pkg.github.com/etolbakov/test-pr-repo"
                                  :username :env/GH_PACKAGES_USR
                                  :password :env/GH_PACKAGES_PSW}]]

  :dependencies [[org.clojure/clojure "1.10.3"]
                 [metosin/jsonista                   "0.3.4"]
                 [org.clojure/data.csv               "1.0.0"]
                 [uk.co.hyde-housing/test-pr-repo              "7.1.0"]
                 ]
  :repl-options {:init-ns dependant-bot-check-for-clojure.core})
