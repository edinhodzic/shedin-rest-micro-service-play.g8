package $package$.guice

import com.google.inject.{AbstractModule, TypeLiteral}
import $package$.crud.binding.PlayBindings._
import $package$.crud.model.$domain$
import $package$.crud.repository.$domain$CrudRepository
import $package$.crud.service.$domain$CrudService
import io.shedin.crud.lib.{CrudRepository, CrudService}
import play.api.libs.json.Format

/**
  * This class is a Guice module that tells Guice how to bind several different
  * types. This Guice module is created when the Play application starts.
  *
  * Play will automatically use any class called `$package$.module.Module` that is in
  * the root package. You can create modules in other locations by adding
  * `play.modules.enabled` settings to the `application.conf` configuration file.
  */
class GuiceBindings extends AbstractModule {

  override def configure() = {
    bind(new TypeLiteral[Format[$domain$]] {}).toInstance($domain;format="lower"$Format)
    bind(new TypeLiteral[CrudService[$domain$]] {}).to(classOf[$domain$CrudService])
    bind(new TypeLiteral[CrudRepository[$domain$]] {}).to(classOf[$domain$CrudRepository])
  }

}
