<template>
  <div>
    <ul class="list-group list-group-flush">
      <li class="list-group-heading">
        <h3>Recent Transactions</h3>
      </li>
      <li class="list-group-item" v-for="entry in entries">
        <p style="text-align:left;">
          {{ entry.name }} - ({{ entry.date.toLocaleDateString("en-US") }})
          <span style="float:right;">-${{ entry.amount }}</span>
        </p>
      </li>
    </ul>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';

@Component
export default class Transactions extends Vue {
  @Prop() private entries = this.getRecentTransactions();

  public getRecentTransactions() {
    return [
      {
        name: 'Starbucks',
        amount: 12,
        date: new Date('2019-03-02'),
      },
      {
        name: 'Best Buy',
        amount: 75,
        date: new Date('2019-02-28'),
      },
      {
        name: 'Walmart',
        amount: 20,
        date: new Date('2019-02-26'),
      },
      {
        name: 'Quiktrip',
        amount: 8,
        date: new Date('2019-02-25'),
      },
      {
        name: 'Comcast',
        amount: 75,
        date: new Date('2019-02-22'),
      },
    ];
  }
}
</script>

<style lang="scss">
.list-group-heading {
  list-style-type: none;
}

.list-group-item {
  padding: 10px !important;
  padding-bottom: 10px !important;
}

li p {
  margin: 0;
  padding: 0;
}
</style>
