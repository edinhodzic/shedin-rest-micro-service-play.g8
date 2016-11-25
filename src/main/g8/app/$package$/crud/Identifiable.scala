package $package$.crud

import $package$.crud.model.$domain$

trait Identifiable[T] {
  def id(subject: T): String
}

object Identifiable {

  implicit object Identifiable$domain$ extends Identifiable[$domain$] {
    override def id($domain;format="lower"$: $domain$): String = $domain;format="lower"$.id.orNull
  }

}
