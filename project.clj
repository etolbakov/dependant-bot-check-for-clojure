(def hpm-version              "7.1.0")

(defproject dependant-bot-check-for-clojure "0.1.0-SNAPSHOT"
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
                 [uk.co.hyde-housing/test-pr-repo            ~hpm-version]
                 [http-kit                           "2.5.3"]
                 [com.brunobonacci/mulog                "0.8.1"]
                 [com.brunobonacci/mulog-cloudwatch     "0.8.1"]
                 [com.brunobonacci/mulog-jvm-metrics    "0.8.1"]
                 [com.brunobonacci/mulog-cloudwatch     "0.8.1"]
                 [com.brunobonacci/mulog-zipkin         "0.8.1"]
                 [com.brunobonacci/mulog-mbean-sampler  "0.8.1"]
                 [com.brunobonacci/oneconfig         "0.21.0"]
                 [com.brunobonacci/safely            "0.7.0-alpha3"]
                 ]
  :repl-options {:init-ns dependant-bot-check-for-clojure.core}


  :global-vars {*warn-on-reflection* true}

  :jvm-opts ["-server"]
  )




