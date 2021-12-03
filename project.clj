(def hpm-version               "7.1.0")
(def airfix-version           "0.3.3")
(def mulog-version            "0.8.1")

(defn ver [] (-> "./resources/salesforce-person-source.version" slurp .trim))

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
                 [uk.co.hyde-housing/test-pr-repo             ~hpm-version]
                 [http-kit                           "2.5.3"]
                 [com.brunobonacci/mulog                ~mulog-version]
                 [com.brunobonacci/mulog-cloudwatch     ~mulog-version]
                 [com.brunobonacci/mulog-jvm-metrics    ~mulog-version]
                 [com.brunobonacci/mulog-cloudwatch     ~mulog-version]
                 [com.brunobonacci/mulog-zipkin         ~mulog-version]
                 [com.brunobonacci/mulog-mbean-sampler  ~mulog-version]
                 [com.brunobonacci/oneconfig         "0.21.0"]
                 [com.brunobonacci/safely            "0.7.0-alpha3"]
                 ]
  :repl-options {:init-ns dependant-bot-check-for-clojure.core}


  :global-vars {*warn-on-reflection* true}

  :jvm-opts ["-server"]
  )




