(def test-pr-repo-version              "7.1.0")


(defn ver [] (-> "./resources/dependant-bot-check-for-clojure.version" slurp .trim))

(defproject dependant-bot-check-for-clojure #=(ver)
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :scm {:name "git" :url "https://github.com/etolbakov/dependant-bot-check-for-clojure.git"}

  :repositories [["test-pr-repo" {:url "https://maven.pkg.github.com/etolbakov/test-pr-repo"
                                  :username :env/GH_PACKAGES_USR
                                  :password :env/GH_PACKAGES_PSW}]]

  :dependencies [[org.clojure/clojure "1.10.3"]
                 [metosin/jsonista                   "0.3.0"]
                 [org.clojure/data.csv               "1.0.0"]
                 [uk.co.hyde-housing/test-pr-repo    ~test-pr-repo-version]
                 [http-kit                           "2.5.3"]
                 ]
  :repl-options {:init-ns dependant-bot-check-for-clojure.core}
  :global-vars {*warn-on-reflection* true}
  :jvm-opts ["-server"]
  )
