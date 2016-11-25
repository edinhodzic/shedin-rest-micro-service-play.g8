package $package$.crud.binding

import $package$.crud.model.$domain$
import play.api.libs.json.Json

object PlayBindings {

  implicit val $domain;format="lower"$Reads = Json.reads[$domain$]
  implicit val $domain;format="lower"$Writes = Json.writes[$domain$]
  implicit val $domain;format="lower"$Format = Json.format[$domain$]

}
