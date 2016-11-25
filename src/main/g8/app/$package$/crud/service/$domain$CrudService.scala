package $package$.crud.service

import javax.inject.{Inject, Singleton}

import $package$.crud.model.$domain$

import io.shedin.crud.lib.{CrudRepository, CrudService}

@Singleton
class $domain$CrudService @Inject()
(crudRepository: CrudRepository[$domain$])
  extends CrudService[$domain$](crudRepository)
