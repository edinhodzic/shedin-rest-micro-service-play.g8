package $package$.crud.controller

import javax.inject.{Inject, Singleton}

import $package$.crud.model.$domain$

import io.shedin.crud.lib.CrudService
import io.shedin.crud.play.CrudController
import play.api.libs.json.Format
import scala.concurrent.ExecutionContext

@Singleton
class $domain$CrudController @Inject()
(crudService: CrudService[$domain$])
(implicit executionContext: ExecutionContext, format: Format[$domain$])
  extends CrudController[$domain$](crudService)
