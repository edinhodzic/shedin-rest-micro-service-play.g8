package $package$.crud.repository

import javax.inject.Singleton
import $package$.crud.binding.MongoBindings._
import $package$.crud.model.$domain$
import io.shedin.crud.mongo.MongoRepository
import reactivemongo.bson.BSONObjectID

import scala.concurrent.Future

@Singleton
class $domain$CrudRepository extends MongoRepository[$domain$]("$org$-database") {

  override def create($domain;format="lower"$: $domain$): Future[$domain$] =
    super.create($domain;format="lower"$.copy(id = Some(BSONObjectID.generate().stringify)))

  override def update($domain;format="lower"$Id: String, $domain;format="lower"$: $domain$): Future[Option[$domain$]] =
    super.update($domain;format="lower"$Id, $domain;format="lower"$.copy(id = Option($domain;format="lower"$Id)))

}
