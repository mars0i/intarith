(defproject intarith "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ;; http://stackoverflow.com/a/11429740/1455243:
  :repositories {"ia_math-mvn-repo" "https://raw.github.com/harmanpa/ia_math/mvn-repo/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ;; https://github.com/harmanpa/ia_math:
                 ;; http://interval.sourceforge.net/interval/java/ia_math/README.html:
                 [net.sourceforge.interval/ia_math "1.0-SNAPSHOT"]
                 [me.arrdem/imprecise "1.0.0"]
                 [propaganda "0.2.0"]]
  :main ^:skip-aot intarith.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
