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

// show

import scalismo.mesh.TriangleMesh
import scalismo.io.{MeshIO, StatisticalModelIO}
import scalismo.common.PointId
import scalismo.mesh.TriangleId
import scalismo.geometry.{_3D, Point3D}
import scalismo.image.{DiscreteImage, DiscreteImage3D}
import scalismo.statisticalmodel.PointDistributionModel // indicates that we work in 3D space


object ExampleApp {

    def main(args: Array[String]) : Unit = {

      scalismo.initialize()
      implicit val rng = scalismo.utils.Random(42)

      val ui = ScalismoUI()

      ////////////////////// add code  : gauss

      val mesh: TriangleMesh[_3D] = MeshIO.readMesh(new java.io.File("datasets/half_femur.ply")).get
      //val mesh: TriangleMesh[_3D] = MeshIO.readMesh(new java.io.File("datasets/Segmentation_Segment_2.stl")).get
      
      val femur = ui.createGroup("femur")
      val meshView = ui.show(femur, mesh, "femur")

      println("first point " + mesh.pointSet.point(PointId(0)))
      println("first point " + mesh.pointSet.point(PointId(1)))
      println("first point " + mesh.pointSet.point(PointId(2)))

// first point Point3D(162.2697296142578,-11.115056991577148,301.18719482421875)
     
     
     
     
     // basicval pointCloudView = ui.show(femur, mesh.pointSet, "pointCloud")






      
    
      
  }
}