(defproject wav-transform "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.commons/commons-math3 "3.6.1"]]
  :main ^:skip-aot wav-transform.core
  :target-path "target/%s"
  :java-source-paths ["src"]
  :profiles {:uberjar {:aot :all}})
