package $package$.play

import javax.inject._

import play.api._
import play.api.http.HttpFilters

/**
  * This class configures filters that run on every request. This
  * class is queried by Play to get a list of filters.
  *
  * Play will automatically use filters from any class called
  * `com.example.play.Filters` that is placed the root package. You can load filters
  * from a different class by adding a `play.http.filters` setting to
  * the `application.conf` configuration file.
  *
  * @param environment  Basic environment settings for the current application.
  * @param headerFilter A demonstration filter that adds a header to each response.
  */
@Singleton
class PlayFilters @Inject()(environment: Environment, headerFilter: HeaderFilter) extends HttpFilters {

  override val filters = {
    // Use the example filter if we're running development mode. If we're
    // running in production or test mode then don't use any filters at all.
    if (environment.mode == Mode.Dev) Seq(headerFilter) else Seq.empty
  }

}
