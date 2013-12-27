import sbtassembly.Plugin.{MergeStrategy, PathList, AssemblyKeys}
import AssemblyKeys._

assemblySettings


mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
{
  case PathList("about.html") => MergeStrategy.rename
  case PathList("asm-license.txt") => MergeStrategy.rename
  case PathList("version.txt") => MergeStrategy.rename
  case x => old(x)
}
}