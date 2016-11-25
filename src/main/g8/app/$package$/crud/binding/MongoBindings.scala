package $package$.crud.binding

import $package$.crud.model.$domain$
import reactivemongo.bson.{BSONDocumentReader, BSONDocumentWriter, Macros}

object MongoBindings {

  implicit val $domain;format="lower"$Reader: BSONDocumentReader[$domain$] = Macros.reader[$domain$]
  implicit val $domain;format="lower"$Writer: BSONDocumentWriter[$domain$] = Macros.writer[$domain$]

}
