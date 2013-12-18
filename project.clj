(defproject korma "0.3.0"
  :description "Tasty SQL for Clojure"
  :url "http://github.com/korma/Korma"
  :mailing-list {:name "Korma Google Group"
                 :subscribe "https://groups.google.com/group/sqlkorma"}
  :codox {:exclude [korma.sql.engine
                    korma.sql.fns
                    korma.sql.utils]
          :src-dir-uri "https://github.com/korma/Korma/blob/master"
          :src-linenum-anchor-prefix "L"}

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [c3p0/c3p0 "0.9.1.2"]
                 [org.clojure/java.jdbc "0.2.3"]]

  :min-lein-version "2.0.0"
  
  :profiles {:dev {:dependencies [[com.h2database/h2 "1.3.164"]
                                  [gui-diff "0.4.0"]
                                  [postgresql "9.0-801.jdbc4"]
                                  [slamhound "1.3.1"]
                                  [mysql/mysql-connector-java "5.1.22"]
                                  [criterium "0.3.1"]]
                   :plugins [[codox "0.6.4"]
                             [jonase/eastwood "0.0.2"]
                             [lein-localrepo "0.4.1"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]
                                  [mysql/mysql-connector-java "5.1.22"]
                                  [com.h2database/h2 "1.3.164"]
                                  [criterium "0.3.1"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]
                                  [mysql/mysql-connector-java "5.1.22"]
                                  [com.h2database/h2 "1.3.164"]
                                  [criterium "0.3.1"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [mysql/mysql-connector-java "5.1.22"]
                                  [com.h2database/h2 "1.3.164"]
                                  [criterium "0.3.1"]]}}
  :aliases {"run-tests" ["with-profile" "1.3:1.4:1.5" "test"]
            "slamhound" ["run" "-m" "slam.hound"]}
  :jvm-opts ["-Dline.separator=\n"])
