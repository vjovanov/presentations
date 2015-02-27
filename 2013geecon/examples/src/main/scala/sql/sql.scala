package sql

import java.sql.PreparedStatement

object M extends App {

  val pstmt = con.prepareStatement(s"""
  select (c.name, c.email) from
    Candidate c,
    AppliesTo ato,
    Jobs j
  where
    c.company = ? and
    c.id = ato.cid and ato.jobId = j.id and
    j.company = ?
  """)
  pstmt.setString(1, "Microsoft")
  pstmt.setString(1, "Oracle")
  pstmt.executeQuery()

}

