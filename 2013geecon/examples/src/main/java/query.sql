select (c.name, c.email) from
 Candidate c,
 AppliesTo ato,
 Jobs j
where
 c.company = 'Microsoft' and
 c.id = ato.cid and ato.jid = j.id and
 j.company = 'Oracle'

create.select(Candidate.name, Candidate.phone)
      .from(Candidate)
      .join(AppliesTo)
      .join(Jobs)
      .where(Candidate.company.eq("Microsoft"))
      .and(Jobs.company.eq("Oracle")))
      .and(Candidate.id.eq(AppliesTo.cid))
      .and(AppliesTo.jid.eq(Jobs.id))
