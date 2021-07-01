package example

// basic
import java.awt.Color
import  scalismo.io.MeshIO
import java.io.File
import scalismo.ui.api.ScalismoUI
import scalismo.mesh.TriangleMesh
import scalismo.io.{MeshIO, StatisticalModelIO}

// added 
import scalismo.geometry._
import scalismo.common._
import scalismo.transformations._
import scalismo.io.MeshIO
import scalismo.mesh.TriangleMesh
import scalismo.common.interpolation._
import scalismo.common.interpolation.TriangleMeshInterpolator3D
import scalismo.ui.api._
import scalismo.io.MeshIO


object ExampleApp {

    def main(args: Array[String]) : Unit = {

      scalismo.initialize()
      implicit val rng = scalismo.utils.Random(42)

      val ui = ScalismoUI()

      ////////////////////// add code 
      
      val mesh: TriangleMesh[_3D] = MeshIO.readMesh(new java.io.File("datasets/femur.ply")).get
      val mesh2: TriangleMesh[_3D] = MeshIO.readMesh(new java.io.File("datasets/femur_head.ply")).get

      val paolaGroup = ui.createGroup("femur")
      ui.show(paolaGroup, mesh, "femur")
      ui.show(paolaGroup, mesh2, "femur head")
    
      
  }
}